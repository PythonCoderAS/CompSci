public void doubleList(ArrayList<String> list) {
	for (int i=0; i<list.size(); i++){
        list.add(i, list.get(i));
        i++;
    }
}