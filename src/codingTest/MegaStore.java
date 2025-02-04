package codingTest;

    public class MegaStore {

        public enum DiscountType {
            Standard,
            Seasonal,
            Weight;
        }

        public static double getDiscountedPrice(double cartWeight,
                                                double totalPrice,
                                                DiscountType discountType) {
            throw new UnsupportedOperationException("Waiting to be implemented.");

        }

        public static void main(String[] args) {
            System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
        }
    }

