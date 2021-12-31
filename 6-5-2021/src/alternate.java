public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
	Iterator<Integer> it1 = list1.iterator();
    Iterator<Integer> it2 = list2.iterator();
    ArrayList<Integer> al = new ArrayList<Integer>();
    boolean doFirst = true;
    while (it1.hasNext() || it2.hasNext()){
        if ((doFirst || !it2.hasNext()) && it1.hasNext()){
            al.add(it1.next());
            doFirst = false;
        } else {
            al.add(it2.next());
            doFirst = true;
        }
    }
    return al;
}