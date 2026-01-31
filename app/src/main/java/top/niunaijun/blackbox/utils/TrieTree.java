package top.niunaijun.blackbox.utils;

import java.util.LinkedList;
import java.util.List;
/* loaded from: classes3.dex */
public class TrieTree {
    private final TrieNode root = new TrieNode();

    /* loaded from: classes3.dex */
    public static class TrieNode {
        char content;
        String word;
        boolean isEnd = false;
        List<TrieNode> children = new LinkedList();

        public TrieNode() {
        }

        public boolean equals(Object obj) {
            return (obj instanceof TrieNode) && ((TrieNode) obj).content == this.content;
        }

        public TrieNode nextNode(char c) {
            for (TrieNode trieNode : this.children) {
                if (trieNode.content == c) {
                    return trieNode;
                }
            }
            return null;
        }

        public TrieNode(char c, String str) {
            this.content = c;
            this.word = str;
        }
    }

    public void add(String str) {
        TrieNode trieNode = this.root;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            sb.append(charAt);
            TrieNode trieNode2 = new TrieNode(charAt, sb.toString());
            if (trieNode.children.contains(trieNode2)) {
                trieNode = trieNode.nextNode(charAt);
            } else {
                trieNode.children.add(trieNode2);
                trieNode = trieNode2;
            }
            if (i == str.length() - 1) {
                trieNode.isEnd = true;
            }
        }
    }

    public void addAll(List<String> list) {
        for (String str : list) {
            add(str);
        }
    }

    public String search(String str) {
        TrieNode trieNode = this.root;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!trieNode.children.contains(new TrieNode(charAt, null))) {
                break;
            }
            trieNode = trieNode.nextNode(charAt);
            if (trieNode.isEnd) {
                return trieNode.word;
            }
        }
        return null;
    }
}
