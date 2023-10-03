// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42579#qna

import java.util.*;

class Solution {
    
    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((a1, a2) -> Integer.compare(map.get(a2), map.get(a1)));

        List<Integer> answer = new ArrayList<>();
        for (String item : list) {
            List<Music> music = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(item)) {
                    music.add(new Music(i, plays[i]));
                }
            }

            music.sort(((o1, o2) -> {
                if (o1.count == o2.count) {
                    return o1.index - o2.index;
                }
                return o2.count - o1.count;
            }));

            answer.add(music.get(0).index);
            if (music.size() > 1) {
                answer.add(music.get(1).index);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    static class Music {

        private final int index;

        private final int count;

        public Music(int index, int count) {
            this.index = index;
            this.count = count;
        }

    }
}