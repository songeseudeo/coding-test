def solution(n, computers):
    visited = [False] * n
    count = 0
    
    def dfs(node):
        visited[node] = True
        
        for neighbor, connected in enumerate(computers[node]):
            if connected and not visited[neighbor]:
                dfs(neighbor)
                
    for i in range(n):
        if not visited[i]:
            dfs(i)
            count +=1
            
    return count