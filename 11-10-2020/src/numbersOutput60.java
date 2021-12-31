for (int i=1; i<=60; i++){
    if (i%10 == 0){
        System.out.print("|");
    } else {
    System.out.print(" ");
    }
}
System.out.println();
for (int i=0; i<6; i++){
    for (int j=1; j<=10; j++){
        System.out.print(j % 10);
    }
}