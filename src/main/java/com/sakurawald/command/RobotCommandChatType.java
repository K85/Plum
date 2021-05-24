package com.sakurawald.command;

//用于描述机器人的指令支持的使用者
/*
 * 一旦Robot和其他人成为Friend，则一定为FRIEND_CHAT。
 * 即使其他人从群里打开和Robot的聊天界面，聊天类型也是FRIEND_CHAT。
 * 
 * 群里聊天的类型为GROUP_CHAT
 * 
 * 与Robot不是好友关系的人，从群里打开与Robot的聊天界面，则聊天类型为GROUP_TEMP_CHAT
 * 
 * */
public enum RobotCommandChatType {
	FRIEND_CHAT(11), GROUP_CHAT(1), GROUP_TEMP_CHAT(2), DISCUSS_MSG(1000), STRANGER_CHAT(2000);

	int type = 0;

	RobotCommandChatType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

}
