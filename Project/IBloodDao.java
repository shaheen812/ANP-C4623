package com.management.dao;

import com.management.model.Blood;

public interface IBloodDao 
{
	void saveBlood(Blood blood);
	void updateBlood(Blood blood);
	void deleteBlood(Blood blood);


}
