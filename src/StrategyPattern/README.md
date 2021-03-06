# 策略模式 Strategy Pattern
策略模式定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的用户。

策略模式可以很好地解决使用大量`if/else`的问题。例如，《Head First设计模式》中的示例，实现鸭子的行为。比如，活鸭子都会呱呱叫，橡皮鸭子会吱吱叫，木头鸭子不会叫；活鸭子会飞，但是橡皮鸭子和木头鸭子不会飞。

在这种情况下，我们可以使用策略模式，将鸭子的叫唤和飞行这两个行为进行包装，供给鸭子类使用。