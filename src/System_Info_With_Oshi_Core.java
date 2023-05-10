import oshi.SystemInfo;

public class System_Info_With_Oshi_Core {
    public static void main(String args[]){

        // At first, we have to add dependency of Oshi-core Library

        SystemInfo systemInfo = new SystemInfo();

        System.out.println("Device Info: "+systemInfo.getHardware().getComputerSystem());
        System.out.println("CPU on device: "+systemInfo.getHardware().getProcessor());
        System.out.println("GPU on device: "+systemInfo.getHardware().getGraphicsCards());
        System.out.println("Memory on device: "+systemInfo.getHardware().getMemory());
        System.out.println("Disk storage on device: "+systemInfo.getHardware().getDiskStores());
        System.out.println("Network Interfaces on device: "+systemInfo.getHardware().getNetworkIFs());
        System.out.println("Displays on device: "+systemInfo.getHardware().getDisplays());

    }
}
