# SpiralTraverse
- Write a function that takes in an two dimensional array return an one dimensional array of all elements in spiral order
- traverser patent , top left to right , top right to bottom, bottom right to left, bottom left to top left repeat process, but donot revisited the index more then once.
# Solution
- using the condition to traverser all the two dimensional array
- if right is not visit and up && left is not movable move right
- if right is up and right is not movable move down if posible
- if down is not movable right is not movable  move left, 
- if left is not movable down is not moveable move up
- marked as isVisited
- helpfuction : isMovable() , 
- isMovable() 

