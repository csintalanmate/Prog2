class HardDisk
{
    private String gyarto;
    private double kapacitas;
    private double used;

    public HardDisk(String gyarto, double kapacitas)
    {
        this.gyarto = gyarto;
        this.kapacitas = kapacitas;
        this.used = 0.0;
    }

    public String getManufacturer()
    {
        return this.gyarto;
    }

    public double getCapacity()
    {
        return this.kapacitas;
    }

    public double getUsedSpace()
    {
        return this.used;
    }

    public double getFreeSpace()
    {
        return this.kapacitas - this.used;
    }

    public boolean isBiggerThan(HardDisk other)
    {
        return this.kapacitas > other.kapacitas;
    }

    public boolean download(double size)
    {
        if (size > this.getFreeSpace())
        {
            return false;
        }
        else
        {
            this.used += size;
            return true;
        }
    }

    public boolean download(String sizeStr)
    {
        double size = Double.parseDouble(sizeStr);
        return this.download(size);
    }

    @Override
    public String toString()
    {
        return String.format("%s(cap: %1f GB, used: %1f GB)", this.gyarto, this.kapacitas, this.used);
    }
}