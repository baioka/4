### Problem 02. Find Center of Star Graph
There is an undirected **star** graph consisting of `n` nodes labeled from `1` to `n`.
A star graph is a graph where there is one **center** node and **exactly** `n-1` edges that connect the center node with every other node.

You are given a 2D integer array `edges` where each `edges[i] = {u[i], v[i]}` indicates that there is an edge between the nodes `u[i]` and `v[i]`.
Return the center of the given star graph.

Write your solution in [src/Problem02.java](src/Problem02.java)

<details>
<summary> Hint 1</summary>
The center is the only node that has more than one edge.
</details>

<details>
<summary> Hint 2</summary>
The center is also connected to all other nodes.
</details>

<details>
<summary> Hint 3</summary>
Any two edges must have a common node, which is the center.
</details>


#### Example 1:

<img width="331" height="321" alt="image" src="https://github.com/user-attachments/assets/6d4e2173-60bd-4351-a15c-d60481fa2406" />

```
Input: edges = [[1,2],[2,3],[4,2]]
Output: 2
Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
```

#### Example 2:

```
Input: edges = [[1,2],[5,1],[1,3],[1,4]]
Output: 1
```

#### Constraints

+ `3 <= n <= 105`
+ `edges.length == n-1`
+ `edges[i].length == 2`
+ `1 <= u[i], v[i] <= n`
+ `u[i] != v[i]`
+ The given `edges` represent a valid star graph.
