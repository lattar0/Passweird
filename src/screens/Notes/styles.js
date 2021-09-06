import { StyleSheet } from "react-native";
import { theme } from "../../styles/theme";

export const styles = StyleSheet.create({
  container: {
    minHeight: '100%',
    flexDirection: 'column',
    justifyContent: 'center',
    alignItems: 'center'
  },

  main: {
    flex: 1,
    color: theme.colors.white,
    alignItems: 'center',
    justifyContent: 'center'
  },

  text: {
    color: theme.colors.white
  }
});