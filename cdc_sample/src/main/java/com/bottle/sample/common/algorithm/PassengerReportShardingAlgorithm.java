package com.bottle.sample.common.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;
import java.util.zip.CRC32;

public class PassengerReportShardingAlgorithm implements PreciseShardingAlgorithm<String> {
	
	@Override
	public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
		/*availableTargetNames: t_passenger_report_0,..t_passenger_report_100
		shardingValue: {"logicTableName":"t_passenger_report","columnName":"identity","value":396416249350848512}
		collection:["t_passenger_report_0",.."t_passenger_report_100"],preciseShardingValue:{"logicTableName":"t_passenger_report","columnName":"identity","value":396416249350848512}
		name具体的表 t_passenger_report_0、..t_passenger_report_100*/
		for (String name : availableTargetNames) {
			CRC32 c = new CRC32();
			c.update(shardingValue.getValue().getBytes());
			long a=c.getValue()>> 16 & 0x7fff;
			if (name.endsWith(String.valueOf(a % 100))) {
				return name;
			}
		}
		return null;
	}
}