package com.telegrambot.BotTelegram.bot;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import controladores.Puntos;

@Service
public class BotTelegram extends TelegramLongPollingBot {

	Puntos p = new Puntos();

	@Override
	public void onUpdateReceived(Update update) {
		// Se obtiene el mensaje escrito por el usuario
		String messageTextReceived = update.getMessage().getText();
		p.InitList();
		

		System.out.println("Escribieron en el bot " + messageTextReceived);

		// Se obtiene el id de chat del usuario
		final long chatId = update.getMessage().getChatId();

		// Se crea un objeto mensaje
		SendMessage message = new SendMessage();
		message.setChatId(chatId);
		//System.out.println(chatId);
		/*SendMessage message = new SendMessage();
		message.setChatId(chatId);
		if(update.getMessage().getText().toLowerCase().equals("/help")) {
			message.setText("utiliza /winners para ver quien va en cabeza");
			try {
				// Se envía el mensaje
				execute(message);
			} catch (TelegramApiException e) {
				e.printStackTrace();
			}
		}
		//message.setText(p.Mensaje());
		if (update.getMessage().getText().toLowerCase().equals("/winners")) {
			message.setText(p.Mensaje());
			try {
				// Se envía el mensaje
				execute(message);
			} catch (TelegramApiException e) {
				e.printStackTrace();
			}
		}
		if (update.getMessage().getText().toLowerCase().equals("/ranking")) {
			message.setText(p.MensajeTabla());
			try {
				// Se envía el mensaje
				execute(message);
			} catch (TelegramApiException e) {
				e.printStackTrace();
			}
		}//*/
		
		
		switch(update.getMessage().getText().toLowerCase()) {
			case "/help":
				message.setText("utiliza /winners para ver quien va en cabeza\n"
						+ " utiliza /nombrequipo para ver el desglose de tus actividades (nombreequipo todo junto)");
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/winners":
				message.setText(p.Mensaje());
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/ranking":
				message.setText(p.MensajeTabla());
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/degara":
				message.setText(p.MensajeTeam("degara".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/jslovers":
				message.setText(p.MensajeTeam("jslovers".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/bugabit":
				message.setText(p.MensajeTeam("bugabit".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/lospibesdelfondo":
				message.setText(p.MensajeTeam("los pibes del fondo".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/arenal+":
				message.setText(p.MensajeTeam("arenal+".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/vallesilicona":
				message.setText(p.MensajeTeam("valle silicona".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/crucedebanderas":
				message.setText(p.MensajeTeam("cruce de banderas".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/lunera":
				message.setText(p.MensajeTeam("lunera".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/codepirinha":
				message.setText(p.MensajeTeam("codepirinha".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			case "/equipoaa":
				message.setText(p.MensajeTeam("equipo aa".toUpperCase()));
				try {
					// Se envía el mensaje
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				break;
			default:
				try {
					// Se envía el mensaje
					message.setText("Busque informacion /help");
					execute(message);
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
				
		}



	}

	@Override
	public String getBotUsername() {
		return "SoleraBootcampBot";
	}

	@Override
	public String getBotToken() {
		return "5771394734:AAGjNnDFymtdlBZO3Ad_HJpI3-UrQzBfI5w";
	}

	public void onGitupdate(){
		p.InitList();
	final long chat =-817583843;
	SendMessage message = new SendMessage();
	message.setChatId(chat);
	message.setText(p.Mensaje());
		try {
			// Se envía el mensaje
				execute(message);
			} catch (TelegramApiException e) {
				e.printStackTrace();
			}
	}
}
