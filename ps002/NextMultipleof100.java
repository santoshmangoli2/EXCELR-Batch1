package ps002;


    public class NextMultipleof100 {
        public static void main(String[] args) {
            int number = 245; // Replace with your input number
            int nextMultiple = findNextMultipleOf100(number);
            System.out.println("The next multiple of 100 after " + number + " is " + nextMultiple);
        }
    
        public static int findNextMultipleOf100(int number) {
            return ((number / 100) + 1) * 100;
        }
    }
    

