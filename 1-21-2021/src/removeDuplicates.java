public void removeDuplicates(ArrayList<String> list) {
    ArrayList<String> seen = new ArrayList<String>();
    for (int i=list.size() - 1; i >= 0; i--){
        if (seen.contains(list.get(i))){
            list.remove(i);
        } else {
            seen.add(list.get(i));
        }
    }
}