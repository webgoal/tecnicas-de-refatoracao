

class MicroBlogger
	def start
		command = ""
		while command != "q"
			printf "enter command (tweet, dm, help, q): "
			command = gets.chomp
			process(command)
		end	
	end

	class QuitCommand
		def match?(input)
			input == "q"
		end

		def execute
			puts "Goodbye"
		end	
	end

	class TweetCommand
		def match?(input)
			input == "tweet"
		end

		def execute
			puts "Tweeting"
		end
	end	

	class DirectMessageCommand
		def match?(input)
			input == "dm"
		end

		def execute
			puts "direct messaging"
		end
	end	

	class HelpCommand
		def match?(input)
			input == "help"
		end

		def execute
			puts "helping"
		end
	end

	class NoActionCommand
		def match?(input)
			true
		end

		def execute
		end
	end

	def process(input)
		quit = QuitCommand.new
		tweet = TweetCommand.new
		dm = DirectMessageCommand.new
		help = HelpCommand.new
		no_action = NoActionCommand.new

		commands = [quit, tweet, dm, help, no_action]
		found_command = commands.find {|command| command.match?(input) }
		found_command.execute
	end
end

MicroBlogger.new.start