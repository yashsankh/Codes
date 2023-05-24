from collections import deque

graph={
    'A':('B','C'),
    'B':('D','A'),
    'C':('A','E'),
    'D':('B','E','F'),
    'E':('C','D','F'),
    'F':('D','E'),
}
print(graph)
start_node=input("Enter the start node ")
goal_node=input("Enter the goal node ")

def bfs(graph,start_node,goal_node):

    queue=deque([(start_node,[start_node])])

    while queue:
         
        current_node , path = queue.popleft()
#ascynchronous process
        if current_node==goal_node:
            return path

        for neighbour in graph[current_node]:
            if neighbour not in path:
                queue.append((neighbour,path+[neighbour]))

    return None

path=bfs(graph,start_node,goal_node)

if path is not None:
    print(f"Path from {start_node} to {goal_node} = {path}");
else:
    print("Not Found")


