public static void removeInRange(ArrayList<Integer> list, int value, int min, int max) {
	for (int i=min; i<max; i++){
        if (list.get(i) == value){
            list.remove(i);
            max--;
            i--;
        }
    }
}