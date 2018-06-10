/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    Map<Integer, Employee> employeeMap;
    public int getImportance(List<Employee> employees, int id) {
        employeeMap = new HashMap();
        for(Employee emp : employees) employeeMap.put(emp.id, emp);
        return dfs(id);
    }
    private int dfs(int id) {
        Employee emp = employeeMap.get(id);
        int ans = emp.importance;
        for (Integer subid: emp.subordinates)
            ans += dfs(subid);
        return ans;
    }
}