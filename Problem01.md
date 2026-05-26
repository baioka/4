### Problem 01. Find Champion

There are `n` teams numbered from `0` to `n-1` in a tournament; each team is also a node in a DAG (Directed Acyclic Graph).

You are given the integer `n` and a **0-indexed** 2D integer array `edges` of length `m` representing the DAG,
where `edges[i] = {u[i], v[i]}` indicates that there is a directed edge from team `u[i]` to team `v[i]` in the graph.

A directed edge from `a` to `b` in the graph means that team `a` is stronger than team `b` and team `b` is weaker than team `a`.

Team `a` will be the champion of the tournament if there is no team `b` that is stronger than team `a`.

Return _the team that will be the **champion** of the tournament if there is a **unique** champion, otherwise, return_ `-1`.

##### Notes

+ A **cycle** is a series of nodes `a[1], a[2], ..., a[n], a[n+1]` such that
node `a[1]` is the same node as node `a[n+1]`,
the nodes `a[1], a[2], ..., a[n]` are distinct,
and there is a directed edge from the node `a[i]` to node `a[i+1]` for every `i` in the range `[1, n]`.
+ A **DAG** is a directed graph that does not have any **cycle**.

Write your solution in [src/Problem01.java](src/Problem01.java)

<details>
<summary> Hint</summary>
The champion(s) should have in-degree 0 in the DAG.
</details>

#### Example 1:

<img width="300" height="300" alt="image" src="https://github.com/user-attachments/assets/27593015-a7f6-4730-8da8-e8374d09bbcf" />

```
Input: n = 3, edges = [[0,1],[1,2]]
Output: 0
Explanation: Team 1 is weaker than team 0. Team 2 is weaker than team 1. So the champion is team 0.
```

#### Example 2:

<img width="300" height="300" alt="image" src="https://github.com/user-attachments/assets/c7b80104-fbfc-4a6c-8054-4b7c5f7a4c7a" />

```
Input: n = 4, edges = [[0,2],[1,3],[1,2]]
Output: -1
Explanation: Team 2 is weaker than team 0 and team 1. Team 3 is weaker than team 1. But team 1 and team 0 are not weaker than any other teams. So the answer is -1.
```

#### Constraints


+ `1 <= n <= 100`
+ `m == edges.length`
+ `0 <= m <= n * (n - 1) / 2`
+ `edges[i].length == 2`
+ `0 <= edge[i][j] <= n - 1`
+ `edges[i][0] != edges[i][1]`
+ The input is generated such that if team `u` is stronger than team `v`, team `v` is not stronger than team `u`.
+ The input is generated such that if team `u` is stronger than team `v` and team `v` is stronger than team `w`, then team `u` is stronger than team `w`.
```

