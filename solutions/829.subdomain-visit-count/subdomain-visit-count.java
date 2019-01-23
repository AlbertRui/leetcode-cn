class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();
        for(String cpdomain : cpdomains) {
            int i = cpdomain.indexOf(' ');
            int num = Integer.valueOf(cpdomain.substring(0, i));
            String domain = cpdomain.substring(i + 1);
            for(i = 0; i < domain.length(); i++)
                if(domain.charAt(i) == '.') {
                    String curDomain = domain.substring(i + 1);
                    count.put(curDomain, count.getOrDefault(curDomain, 0) + num);
                }
            count.put(domain, count.getOrDefault(domain, 0) + num);
        }
        for(String domain : count.keySet())
            res.add(count.get(domain) + " " + domain);
        return res;
    }
}