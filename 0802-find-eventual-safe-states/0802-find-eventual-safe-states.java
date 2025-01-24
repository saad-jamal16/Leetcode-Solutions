class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
                List<Integer> res = new ArrayList<>();
        
        // If the graph is empty, return an empty list
        if (graph == null || graph.length == 0) {
            return res;
        }

        // Array to track the state of each node
        // 0 = unvisited, 2 = visiting, 1 = safe
        int[] color = new int[graph.length];

        // Iterate through all nodes in the graph
        for (int i = 0; i < graph.length; i++) {
            // If a node is safe, add it to the result
            if (isSafe(graph, i, color)) {
                res.add(i);
            }
        }

        return res; // Return the list of safe nodes
    }

    // Helper function to determine if a node is safe
    private boolean isSafe(int[][] graph, int node, int[] color) {
        // If the node is already processed, return its safety status
        if (color[node] != 0) {
            return color[node] == 1; // Safe if marked as 1
        }

        // Mark the node as visiting (potential cycle)
        color[node] = 2;

        // Check all neighbors of the current node
        for (int neighbor : graph[node]) {
            // If any neighbor is unsafe, this node is also unsafe
            if (!isSafe(graph, neighbor, color)) {
                return false;
            }
        }

        // Mark the node as safe and return true
        color[node] = 1;
        return true;

    }
}