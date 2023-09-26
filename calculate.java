class calculate {
    static int cube(int x) {
        return x * x * x;
    }

    public static void main(String args[]) {
        int result = calculate.cube(2);
        System.out.println("Cube of 2 is " + result);
    }
}
