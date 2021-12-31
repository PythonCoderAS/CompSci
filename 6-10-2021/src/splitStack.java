public void splitStack(Stack<Integer> s) {
	Iterator<Integer> it = s.iterator();
    Stack<Integer> positives = new Stack<Integer>();
    while (it.hasNext()){
        int item = it.next();
        if (item >= 0){
            positives.push(item);
            it.remove();
        }
    }
    Iterator<Integer> it2 = positives.iterator();
    while (it2.hasNext()){
        s.push(it2.next());
    }
}