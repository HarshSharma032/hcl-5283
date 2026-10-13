
package Exception;

class InvalidSalaryException extends Exception {
    InvalidSalaryException(String message) {
        super(message);
    }
}

class CustomException {
    public static void main(String[] args) {
        double salary = 5000;

        try {
            if (salary < 10000) {
                throw new InvalidSalaryException("Salary is too low!");
            }
            System.out.println("Salary accepted");
        }
        catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
