from pyamaze import maze,agent,textLabel
from queue import PriorityQueue
def h(cell1,cell2):
    x1,y1=cell1
    x2,y2=cell2

    return abs(x1-x2) + abs(y1-y2)
def aStar(m):
    start=(m.rows,m.cols)
    g_score={cell:float('inf') for cell in m.grid}
    g_score[start]=0
    f_score={cell:float('inf') for cell in m.grid}
    f_score[start]=h(start,(1,1))

    open=PriorityQueue()
    open.put((h(start,(1,1)),h(start,(1,1)),start))
    aPath={}
    while not open.empty():
        currCell=open.get()[2]
        if currCell==(1,1):
            break
        for d in 'ESNW':
            if m.maze_map[currCell][d]==True:
                if d=='E':
                    childCell=(currCell[0],currCell[1]+1)
                if d=='W':
                    childCell=(currCell[0],currCell[1]-1)
                if d=='N':
                    childCell=(currCell[0]-1,currCell[1])
                if d=='S':
                    childCell=(currCell[0]+1,currCell[1])

                temp_g_score=g_score[currCell]+1
                temp_f_score=temp_g_score+h(childCell,(1,1))

                if temp_f_score < f_score[childCell]:
                    g_score[childCell]= temp_g_score
                    f_score[childCell]= temp_f_score
                    open.put((temp_f_score,h(childCell,(1,1)),childCell))
                    aPath[childCell]=currCell
    fwdPath={}
    cell=(1,1)
    while cell!=start:
        fwdPath[aPath[cell]]=cell
        cell=aPath[cell]
    return fwdPath

if __name__=='__main__':
    m=maze(5,5)
    m.CreateMaze()
    path=aStar(m)

    a=agent(m,footprints=True)
    m.tracePath({a:path})
    l=textLabel(m,'A Star Path Length',len(path)+1)

    m.run()

# This code is an implementation of the A* search algorithm for finding a path from the bottom right corner of a maze to the top left corner. The maze is generated using the maze function from the pyamaze library, and the A* search algorithm is implemented using a priority queue.

# The h function is the heuristic function used to estimate the distance from a cell to the goal cell. In this case, it uses the Manhattan distance between the two cells.

# The aStar function is the main implementation of the A* search algorithm. It initializes the start cell and the g and f scores for all cells, and adds the start cell to the priority queue. It then continues to loop until the priority queue is empty, taking the cell with the lowest f score from the queue and checking its neighbors to see if they can be reached and if their g and f scores can be improved. If a neighbor's f score can be improved, it is added to the priority queue and its g and f scores are updated.

# The fwdPath dictionary is used to store the forward path from the start cell to the goal cell, and is built by following the path of cells with the lowest f score from the goal cell back to the start cell.

# Finally, the maze object is created with a size of 5x5, and a maze is generated using the CreateMaze function. The A* search algorithm is called to find the path from the bottom right corner to the top left corner, and the resulting path is traced on the maze using the tracePath function. A text label is added to display the length of the path, and the maze is run using the run function.