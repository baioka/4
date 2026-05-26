### Problem 9. Network Delay Time 3 (Floyd-Warshall)

(Use **Floyd-Warshall**'s shortest path algorithm to solve the problem)

You are given a network of `n` nodes, labeled from `1` to `n`.
You are also given `times`, a list of travel times as directed edges `times[i] = (u[i], v[i], w[i])`,
where `u[i]` is the source node, `v[i]` is the target node, and `w[i]` is the time it takes
for a signal to travel from source to target.

We will send a signal from a given node `k`.
Return _the minimum time it takes for all the `n` nodes to receive the signal_.
If it is impossible for all the n nodes to receive the signal, return `-1`.

Write your solution in [src/Problem10.java](src/Problem10.java)

<details>
<summary>Hint 1</summary>
Use Floyd-Warshall's algorithm.
</details>

#### Example 1:

<img width="217" height="239" alt="image" src="https://github.com/user-attachments/assets/3e3d3ab3-9c34-4ccd-9c8e-3e5f670d09f0" />

```
Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
Output: 2
```

#### Example 2:

```
Input: times = [[1,2,1]], n = 2, k = 1
Output: 1
```

#### Example 3:

```
Input: times = [[1,2,1]], n = 2, k = 2
Output: -1
```

#### Constraints

+ `1 <= k <= n <= 100`
+ `1 <= times.length <= 6000`
+ `times[i].length == 3`
+ `1 <= u[i], v[i] <= n`
+ `u[i] != v[i]`
+ `0 <= w[i] <= 100`
+ All the pairs `(u[i], v[i])` are **unique**. (i.e., no multiple edges.)
