graph={

    0:[1,2],
    1:[0,3,4],
    2:[1,5],
    3:[1],
    4:[1],
    5:[2]
}


def dfs(current,visited):

    visited.add(current)
    

    if current==4:
        print(visited,end=" ")

    for i in graph[current]:
        if i not in visited:
            dfs(i,visited)
                

dfs(0,set())