public void stutter(Stack<Integer> s) {
    Stack<Integer> reversed = new Stack<Integer>();
	Iterator<Integer> it = s.iterator();
    while (it.hasNext()){
        reversed.push(it.next());
        it.remove();
    }
	Iterator<Integer> it2 = reversed.iterator();
    while (it2.hasNext()){
        Integer val = it2.next();
        for (int i=0; i<2; i++){
            s.push(val);
        }
    }
}