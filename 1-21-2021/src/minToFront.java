public void minToFront(ArrayList<Integer> list) {
	int smallest = list.get(0).intValue();
    int smallestIndex = 0;
    for (int i=1; i<list.size(); i++){
        if (list.get(i).intValue() < smallest){
            smallest = list.get(i).intValue();
            smallestIndex = i;
        }
    }
    list.remove(smallestIndex);
    list.add(0, smallest);
}