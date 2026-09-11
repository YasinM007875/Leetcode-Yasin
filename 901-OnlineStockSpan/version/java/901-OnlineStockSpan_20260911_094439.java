// Last updated: 9/11/2026, 9:44:39 AM
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class StockSpanner {
5    private Deque<int[]> stack;
6
7    public StockSpanner() {
8        stack = new ArrayDeque<>();
9    } 
10    public int next(int price) {
11        int span = 1;
12        while (!stack.isEmpty() && stack.peek()[0] <= price) {
13            span += stack.pop()[1];
14        }
15        stack.push(new int[]{price, span});
16        
17        return span;
18    }
19}