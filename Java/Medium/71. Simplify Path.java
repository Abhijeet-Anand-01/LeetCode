// Approach 1 : Using Stack

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");
        
        for (int i = 0; i < p.length; i++){
            if (!stack.isEmpty()  && p[i].equals("..")) 
                stack.pop();
            else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                stack.push(p[i]);
        }
        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty()) {
            res.insert(0,stack.pop()).insert(0,"/");
        }
        return res.toString();
    }
}


// Approach 2 : Using ArrayDeque

class Solution {
    public String simplifyPath(String path) {
        Deque<String> queue = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");
        
        for (int i = 0; i < p.length; i++){
            if (!queue.isEmpty()  && p[i].equals("..")) 
                queue.removeLast();
            else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                queue.add(p[i]);
        }
        if(queue.isEmpty()) return "/";
        while(!queue.isEmpty()) {
            res.append("/" + queue.removeFirst());
        }
        return res.toString();
    }
}
