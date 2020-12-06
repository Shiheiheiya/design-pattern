
部件由部件生产线提供，手机由组装线组装。
现假设手机生产需要部件有：电池、屏幕、CPU。
在增加工厂模式/单例模式新零部件时，仅需增加新生产线及生成方法，而无需修改原实现。

CPU生产厂：CpuComponent
电池生产厂：BatteryComponent
屏幕生产厂：ScreenComponent
手机装配厂：PhoneFactory

工厂方法测试：FactoryDemo