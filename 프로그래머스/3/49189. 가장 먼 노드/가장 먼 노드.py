def solution(n, edge):
    graph = [[] for _ in range(n + 1)]
    for a, b in edge:
        graph[a].append(b)
        graph[b].append(a)
        
    distances = [-1] * (n + 1)
    
    queue = [1]
    distances[1] = 0
    
    while queue:
        current = queue.pop(0)
        
        for neighbor in graph[current]:
            if distances[neighbor] == -1:
                distances[neighbor] = distances[current] +1
                queue.append(neighbor)
                
    max_dist = max(distances)
    return distances.count(max_dist)