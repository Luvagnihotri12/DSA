class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pair = Map.of(')', '(', ']', '[', '}', '{');
        for(char c : s.toCharArray()){
            if(!pair.containsKey(c)) stack.push(c);
            else if(stack.isEmpty() || stack.pop() != pair.get(c)) return false;
        }
        return stack.isEmpty();
    }
}