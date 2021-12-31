public void writeSequence(int n) {
	if (n < 1){
        throw new IllegalArgumentException();
    } else if (n == 1){
        System.out.print(1);
    } else if (n == 2){
        System.out.print(1 + " " + 1);
    } else {
        System.out.print((n + 1) / 2 + " ");
        writeSequence(n-2);
        if (n <= 4){
            System.out.print(" ");
        }
        System.out.print((n + 1) / 2 + " ");
    }
}