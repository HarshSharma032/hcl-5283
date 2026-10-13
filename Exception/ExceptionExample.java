
package Exception;

class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(a / b);

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);

            String s = null;
            System.out.println(s.length());

            int n = Integer.parseInt("abc");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds");
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
        catch (Exception e) {
            System.out.println("Other Exception: " + e);
        }
        finally {
            System.out.println("Program completed");
        }
    }
}
