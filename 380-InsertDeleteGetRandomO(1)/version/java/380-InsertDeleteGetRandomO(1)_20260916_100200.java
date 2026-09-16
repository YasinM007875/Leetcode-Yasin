// Last updated: 9/16/2026, 10:02:00 AM
1class RandomizedSet {
2    java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
3    java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
4
5    public RandomizedSet() {
6    }
7
8    public boolean insert(int val) {
9        if (map.containsKey(val)) {
10            return false;
11        }
12
13        map.put(val, list.size());
14        list.add(val);
15
16        return true;
17    }
18
19    public boolean remove(int val) {
20        if (!map.containsKey(val)) {
21            return false;
22        }
23
24        int index = map.get(val);
25        int last = list.get(list.size() - 1);
26
27        list.set(index, last);
28        map.put(last, index);
29
30        list.remove(list.size() - 1);
31        map.remove(val);
32
33        return true;
34    }
35
36    public int getRandom() {
37        return list.get((int)(Math.random() * list.size()));
38    }
39}