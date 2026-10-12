

class BrowserHistory {
ArrayList<String> history = new ArrayList<>();
int current = 0;

public BrowserHistory(String homepage) {
    history.add(homepage);
}

public void visit(String url) {
    // Current website ke baad ki Forward history delete karo
    while (history.size() > current + 1) {
        history.remove(history.size() - 1);
    }

    // Nayi website add karo
    history.add(url);

    // Current index ko nayi website par set karo
    current++;
}

public String back(int steps) {
    // Peeche jao, lekin index 0 se neeche nahi
    current = Math.max(0, current - steps);

    return history.get(current);
}

public String forward(int steps) {
    // Aage jao, lekin last website se aage nahi
    current = Math.min(history.size() - 1, current + steps);

    return history.get(current);
}


}
