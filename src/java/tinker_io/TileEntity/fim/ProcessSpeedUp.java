package tinker_io.TileEntity.fim;

import tinker_io.api.IStateMachine;

public class ProcessSpeedUp implements Process {
	
	@Override public void accept(FuelFSM m) {
		m.heat();
		if (m.canChangeState && !m.isSpeedingUp())
		{
			m.setProcess(m.waitFuel);
			m.canChangeState = false;
		}
	}
}