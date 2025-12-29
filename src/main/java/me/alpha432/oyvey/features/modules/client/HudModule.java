package me.alpha432.oyvey.features.modules.client;

import me.alpha432.oyvey.event.impl.Render2DEvent;
import me.alpha432.oyvey.features.modules.Module;

public class HudModule extends Module {

    public HudModule() {
        super("Poker.Fun", "Displays Poker.Fun watermark", Category.CLIENT, true, false, false);
    }

    @Override
    public void onRender2D(Render2DEvent event) {
        event.getContext().drawTextWithShadow(
                mc.textRenderer,
                "Poker.Fun",
                2, 2,
                -1
        );
    }
}
