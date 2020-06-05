package xml.service;

import java.util.List;

import java.util.ArrayList;

import xml.model.MonsterModel;

public class MonsterService {
public List<MonsterModel> getAllMonster(){
	MonsterModel mm1=new MonsterModel("Baby","Sweet");
	MonsterModel mm2=new MonsterModel("Meow","Cat");
	List<MonsterModel> list= new ArrayList<MonsterModel>();
	list.add(mm1);
	list.add(mm2);
	return list;
}
}
