package com.lineate.bench.pattern.decorator.example1;

public abstract class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if (null != component) {
            component.doJob();
        }
    }
}
