import java.util.*;

public class Test {
    private static int MAX;
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("a", "app", "apple", "desk", "top", "led"));
        final int[] arr = {0};
        set.forEach(item -> {
            if (item.length() > arr[0]) {
                arr[0] = item.length();
            }
        });
        MAX = arr[0];
        String text = "appledesktop";
        List<String> expected = Arrays.asList("apple", "desk", "top");
        test(text, set, expected);

        text = "appledappleatop";
        expected = Arrays.asList("app", "led", "apple", "a", "top");
        test(text, set, expected);

        text = "appleddeskapp";
        expected = Arrays.asList("app", "led", "desk", "app");
        test(text, set, expected);
    }

    private static List<String> split(String text, Set<String> set) {
        List<String> list = new ArrayList<>();
        for (int j = 1; j <= MAX; j++) {
            if (j > text.length()) {
                break;
            }

            String subStr = text.substring(0, j);
            if (!set.contains(subStr)) {
                continue;
            }

            String remain = text.substring(j);
            List<String> remainList;
            if (remain.length() == 0) {
                list.add(subStr);
            } else {
                remainList = split(remain, set);
                if (remainList.size() > 0) {
                    list.add(subStr);
                    list.addAll(remainList);
                }
            }
        }

        return list;
    }

    private static void test(String text, Set<String> set, List<String> expected) {
        List<String> list = split(text, set);

        System.out.println("list 1 " + expected);
        System.out.println("list 2 " + list);
        System.out.println(check(expected, list) ? "OK" : "Bad");
    }

    private static boolean check(List<String> a, List<String> b) {
        if (a.size() != b.size()) {
            return false;
        }

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return false;
            }
        }

        return true;
    }
}
