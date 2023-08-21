package io.github.ones1kk.programers.level2;

public class Lesson49993 {

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        for (String skillTree : skill_trees) {
            for (int j = 0; j < skillTree.toCharArray().length; j++) {
                char tree = skillTree.charAt(j);
                if (skill.contains(String.valueOf(tree))) {
                    sb.append(tree);
                }
            }

            if (skill.startsWith(sb.toString())) {
                answer++;
            }

            sb = new StringBuilder();
        }

        return answer;
    }
}
