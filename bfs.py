from collections import deque

def b_fs(gr, st_node, go_node):
    queue = deque([(st_node, [st_node])])

    while queue:
        current_node, path = queue.popleft()
        print(f"Exploring node {current_node}: Explored nodes so far: {path}")
        if current_node == go_node:
            return path
        for neighbor in gr[current_node]:
            if neighbor not in path:
                queue.append((neighbor, path + [neighbor]))

    return None


gr = {
    'A': ['B', 'C'],
    'B': ['A', 'D'],
    'C': ['A', 'E'],
    'D': ['B', 'E', 'F'],
    'E': ['C', 'D', 'F'],
    'F': ['D', 'E']
}

print(gr)
st_node = input("Enter Start Node: ")
go_node = input("Enter Goal Node: ")


path = b_fs(gr, st_node, go_node)
if path is not None:
    print(f"Path from {st_node} to {go_node}: {path}")
else:
    print(f"No path found from {st_node} to {go_node}")