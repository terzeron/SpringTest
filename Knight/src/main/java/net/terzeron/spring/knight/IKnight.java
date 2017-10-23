package net.terzeron.spring.knight;

public interface IKnight {
	Object embarkOnQuest() throws QuestFailedException;
	String getName();
}
