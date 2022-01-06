import java.util.*;

public class 오픈채팅방_20220106 {

    // https://programmers.co.kr/learn/courses/30/lessons/42888
    public String[] solution(String[] record) {
        String[] answer = {};

        Map<String, String> nickNameMap = new HashMap<>();
        List<String[]> enterManageList = new ArrayList<>();

        for (String s : record) {
            String[] records = s.split(" ");
            String action = records[0];
            String userId = records[1];

            if (!"Leave".equals(action)) {
                String nickname = records[2];
                nickNameMap.put(userId, nickname);
            }

            if (!"Change".equals(action)) {
                String[] userActionArr = new String[]{userId, getActionMsg(action)};
                enterManageList.add(userActionArr);
            }

        }

        answer = new String[enterManageList.size()];
        for(int i=0; i<enterManageList.size(); i++) {
            String[] enterManage = enterManageList.get(i);
            if(enterManage != null && nickNameMap.containsKey(enterManage[0])) {
                answer[i] = nickNameMap.get(enterManage[0]) + enterManage[1];
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public String getActionMsg(String action) {
        String actionMsg = "";

        Map<String, String> actionMsgMap = new HashMap<String, String>(){
            {
                put("Enter", "님이 들어왔습니다.");
                put("Leave", "님이 나갔습니다.");
            }
        };

        if(actionMsgMap.containsKey(action)) {
            actionMsg = actionMsgMap.get(action);
        }

        return actionMsg;
    }

}
