package com.bftcom.devcomp.api;

/**
 *  онстанты
 */
public interface IBotConst {
  // ѕрефиксы очередей
  String QUEUE_SERVICE_PREFIX = "SERVICE_QUEUE_";   // ќчереди, которые слушает сервис
  String QUEUE_ADAPTER_PREFIX = "ADAPTER_QUEUE_";   // ќчереди, которые слушают адаптеры
  String QUEUE_BOT_PREFIX = "BOT_QUEUE_";       // ќчереди, которые слушают экземпл€ры адаптеров

  // »мена системных пропертей, передаваемых в сообщении
  String PROP_ADAPTER_NAME = "ADAPTER_NAME";                // —войство, определ€ющие им€ адаптера
  String PROP_BOT_NAME = "BOT_NAME";                    // —войство, определ€ющие им€ экземпл€ра адаптера
  String PROP_USER_NAME = "USER_NAME";                      // —войство, определ€ющие им€ пользовател€

  // »мена пользователских пропертей, передаваемых в сообщении
  String PROP_BODY_TEXT = "BODY_TEXT";                // —войство, определ€ющие текст, передаваемый от бота и обратно (текст сообщени€)

}
