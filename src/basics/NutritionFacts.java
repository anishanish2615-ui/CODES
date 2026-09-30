package basics;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    // Private constructor for Builder
    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    // Builder class
    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) { calories = val; return this; }
        public Builder fat(int val) { fat = val; return this; }
        public Builder sodium(int val) { sodium = val; return this; }
        public Builder carbohydrate(int val) { carbohydrate = val; return this; }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    @Override
    public String toString() {
        return "NutritionFacts [servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate + "]";
    }

    // ---------------- Pizza Hierarchy ----------------
    public abstract static class Pizza {
        public enum Topping { HAM, MUSHROOM, ONION, SAUSAGE }
        final Set<Topping> toppings;

        abstract static class Builder<T extends Builder<T>> {
            EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

            public T addTopping(Topping topping) {
                toppings.add(Objects.requireNonNull(topping));
                return self();
            }

            abstract Pizza build();
            protected abstract T self();
        }

        Pizza(Builder<?> builder) {
            toppings = builder.toppings.clone();
        }

        @Override
        public String toString() {
            return "Pizza toppings=" + toppings;
        }
    }

    public static class NyPizza extends Pizza {
        public enum Size { SMALL, MEDIUM, LARGE }
        private final Size size;

        public static class Builder extends Pizza.Builder<Builder> {
            private final Size size;

            public Builder(Size size) {
                this.size = Objects.requireNonNull(size);
            }

            @Override public NyPizza build() {
                return new NyPizza(this);
            }

            @Override protected Builder self() { return this; }
        }

        private NyPizza(Builder builder) {
            super(builder);
            size = builder.size;
        }

        @Override
        public String toString() {
            return "NyPizza [size=" + size + ", toppings=" + toppings + "]";
        }
    }

    public static class Calzone extends Pizza {
        private final boolean sauceInside;

        public static class Builder extends Pizza.Builder<Builder> {
            private boolean sauceInside = false;

            public Builder sauceInside() {
                sauceInside = true;
                return this;
            }

            @Override public Calzone build() {
                return new Calzone(this);
            }

            @Override protected Builder self() { return this; }
        }

        private Calzone(Builder builder) {
            super(builder);
            sauceInside = builder.sauceInside;
        }

        @Override
        public String toString() {
            return "Calzone [sauceInside=" + sauceInside + ", toppings=" + toppings + "]";
        }
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();

        System.out.println(cocaCola);
        System.out.println(pizza);
        System.out.println(calzone);
    }
}
